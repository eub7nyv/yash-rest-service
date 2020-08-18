package com.example.restservice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/")
	public App app() throws IOException {
		App app = new App("Yashwanth", "Gardas", "yashwanth.gardas@mckesson.com", "yash", null, null, null, null);

		JSONObject vs = new JSONObject(System.getenv("VCAP_SERVICES"));
		JSONArray up = vs.getJSONArray("user-provided");
		JSONObject ins = up.getJSONObject(0);
		JSONObject cred = (JSONObject) ins.get("credentials");

		app.setSecret1(cred.get("secret1").toString());

		JSONArray credhub = vs.getJSONArray("credhub");
		JSONObject instance = credhub.getJSONObject(0);
		JSONObject credentials = (JSONObject) instance.get("credentials");
		String secret2 = credentials.get("secret2").toString().trim();
		app.setSecret2(secret2);

		app.setSecret3(new String(Files.readAllBytes(Paths.get("/var/mydata/secret3.txt"))).replace("\n", ""));

		app.setSecret4("dcDYChLnabunSH8nrfUjj8h4pdXJ8UWb");

		return app;
	}

}
