package ro.fasttrackit.curs22.homework.curs22homework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs22.homework.curs22homework.model.Questions;
import ro.fasttrackit.curs22.homework.curs22homework.repository.QuestionsRepository;

import java.util.List;

@SpringBootApplication
public class Curs22HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs22HomeworkApplication.class, args);
	}

//	@Bean
//	CommandLineRunner atStartup(QuestionsRepository repo) {
//		return args -> {
//			repo.saveAll(List.of(
//					new Questions(
//							"Care este viteza maximă prevăzută de lege pentru circulaţia în zonele rezidenţiale?",
//							"5 km/h;",
//							"10 km/h;",
//						"20 km/h;"),
//					new Questions(
//							"Este permisă oprirea voluntară a autovehiculului în tuneluri?",
//							"da;",
//							"nu;",
//							"numai dacă lungimea tunelului depăşeşte 1000 m;"),
//					new Questions(
//							"Pe autostradă se interzice:",
//							"circulaţia autovehiculelor în coloană;",
//							"învăţarea conducerii unui vehicul, încercarea prototipurilor de şasiuri şi de vehicule cu motor;",
//							"executarea de lucrări pe partea carosabilă pe timp de noapte;"),
//					new Questions("În ce situaţie vă este permis să opriţi vehiculul sau să staţionaţi pe partea stângă a sensului de mers?",
//							"pe drumurile cu sens unic, dacă rămâne liberă cel puţin o bandă de circulaţie;",
//							"pe drumurile secundare;",
//							"pe drumurile cu cel puţin două benzi pe sens;")));
//		};
//	}
}
