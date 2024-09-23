package project.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.poi.entities.PointOfInterestEntity;
import project.poi.repositories.PointOfInterestRepository;

@SpringBootApplication
public class PoiApplication implements CommandLineRunner {

	public PoiApplication(PointOfInterestRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PoiApplication.class, args);
	}

	private final PointOfInterestRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new PointOfInterestEntity("Lanchonete", 27L, 12L));
		repository.save(new PointOfInterestEntity("Posto", 31L, 18L));
		repository.save(new PointOfInterestEntity("Joalheria", 15L, 12L));
		repository.save(new PointOfInterestEntity("Floricultura", 19L, 21L));
		repository.save(new PointOfInterestEntity("Pub", 12L, 8L));
		repository.save(new PointOfInterestEntity("Supermercado", 23L, 6L));
		repository.save(new PointOfInterestEntity("Churrascaria", 28L, 2L));
	}
}
