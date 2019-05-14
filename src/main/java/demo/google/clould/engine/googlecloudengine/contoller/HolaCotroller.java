package demo.google.clould.engine.googlecloudengine.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/google")
public class HolaCotroller {

	@RequestMapping("/hola")
	public String  hola(){
		return "Hola Amigos";
		
	}
}
