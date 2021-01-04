package asr.proyectoFinal.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.TranslationResult;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.GetVoiceOptions;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;
import com.ibm.watson.text_to_speech.v1.model.Voice;
import com.ibm.watson.text_to_speech.v1.util.WaveUtils;

public class Text2Speech
{
	public static void synthesize(String texto){
	
		IamAuthenticator authenticator = new IamAuthenticator("ZyoQgMtuqSYaEnpGXAYYu-UmfcDN7hrfwTjfzZEQ4Z3_");
		TextToSpeech textToSpeech = new TextToSpeech(authenticator);
		textToSpeech.setServiceUrl("https://api.eu-gb.text-to-speech.watson.cloud.ibm.com/instances/ea58e741-aa9d-4625-9aff-a9767f7d893b");
				
		
		try {
			  SynthesizeOptions synthesizeOptions =
			    new SynthesizeOptions.Builder()
			      .text("Hello world")
			      .accept("audio/wav")
			      .voice("en-US_AllisonV3Voice")
			      .build();

			  InputStream inputStream =
			    textToSpeech.synthesize(synthesizeOptions).execute().getResult();
			  InputStream in = WaveUtils.reWriteWaveHeader(inputStream);

			  OutputStream out = new FileOutputStream("hello_world.wav");
			  byte[] buffer = new byte[1024];
			  int length;
			  while ((length = in.read(buffer)) > 0) {
			    out.write(buffer, 0, length);
			  }

			  out.close();
			  in.close();
			  inputStream.close();
			} catch (IOException e) {
			  e.printStackTrace();
			}
		
		return;
	}
}