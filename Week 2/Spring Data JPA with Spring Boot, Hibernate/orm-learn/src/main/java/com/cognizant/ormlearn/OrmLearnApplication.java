package com.cognizant.ormlearn;

// import java.util.Scanner;
// import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);

    private final ApplicationContext context;

    public OrmLearnApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

	// searching

    // @Override
    // public void run(String... args) {

    //     CountryService countryService = context.getBean(CountryService.class);

    //     Scanner sc = new Scanner(System.in);

    //     LOGGER.info("========== FIND COUNTRY BY CODE ==========");

    //     System.out.print("Enter Country Code (Example: IN, US, JP): ");
    //     String code = sc.nextLine().toUpperCase();

    //     Country country = countryService.getCountry(code);

    //     if (country != null) {
    //         LOGGER.info("Country Found: {}", country);
    //     } else {
    //         LOGGER.info("Country with code {} not found.", code);
    //     }

    //     LOGGER.info("==========================================");
    // }

	//addition 

// 	@Override
// 	public void run(String... args) {

//     	CountryService countryService = context.getBean(CountryService.class);

//     	LOGGER.info("Start");

//     	Country country = new Country("NP", "Nepal");

//     	countryService.addCountry(country);

//     	LOGGER.info("Country Added Successfully");

//     	LOGGER.info("Country : {}", countryService.getCountry("NP"));

//     	LOGGER.info("End");
// }

//update

// @Override
// public void run(String... args) {

//     CountryService countryService = context.getBean(CountryService.class);

//     LOGGER.info("Start");

//     Country country = countryService.getCountry("NP");

//     if (country != null) {

//         LOGGER.info("Before Update : {}", country);

//         country.setName("Federal Democratic Republic of Nepal");

//         countryService.updateCountry(country);

//         LOGGER.info("After Update : {}", countryService.getCountry("NP"));

//     } else {

//         LOGGER.info("Country not found.");

//     }

//     LOGGER.info("End");
// }

// deletion

// 	@Override
// 	public void run(String... args) {

//     	CountryService countryService = context.getBean(CountryService.class);

//     	LOGGER.info("Start");

//     	Country country = countryService.getCountry("NP");

//     	if (country != null) {

//         	LOGGER.info("Country Before Delete : {}", country);

//         	countryService.deleteCountry("NP");

//         	LOGGER.info("Country Deleted Successfully.");

//     	} else {

//         	LOGGER.info("Country not found.");

// 		} 

//     	Country deletedCountry = countryService.getCountry("NP");

//     	LOGGER.info("After Delete : {}", deletedCountry);

//     	LOGGER.info("End");
// }

// //partial search

//     @Override
//     public void run(String... args) {

//         CountryService countryService = context.getBean(CountryService.class);

//         LOGGER.info("Start");

//         List<Country> countries = countryService.searchCountries("United");

//         LOGGER.info("Countries Found:");

//         for (Country country : countries) {
//             LOGGER.info("{}", country);
//         }

//         LOGGER.info("End");
//     }

//addition 

    @Override
    public void run(String... args) {

        CountryService countryService = context.getBean(CountryService.class);

        LOGGER.info("Start");

        try {

            Country country = countryService.findCountryByCode("ABC");

            LOGGER.info("Country : {}", country);

        } catch (CountryNotFoundException e) {

            LOGGER.error(e.getMessage());

        }

        LOGGER.info("End");
    }
}