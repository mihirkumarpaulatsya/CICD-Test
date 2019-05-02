package mihir.paulatsya.TESTonREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TesTonRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesTonRestApplication.class, args);
	}
	
	@RequestMapping("/name")
	public String getMyName() {
		return "Mihir";
	}

}
