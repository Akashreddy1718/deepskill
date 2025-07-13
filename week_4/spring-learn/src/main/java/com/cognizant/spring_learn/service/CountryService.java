package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final ApplicationContext context;
    private final List<Country> countryList;

    public CountryService() {
        // Load country.xml once
        this.context = new ClassPathXmlApplicationContext("country.xml");
        this.countryList = context.getBean("countryList", List.class);
    }

    public Country getCountry(String code) {
        // Case-insensitive search using Java streams and Optional
        Optional<Country> countryOpt = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst();
        return countryOpt.orElse(null);
    }

    public List<Country> getAllCountries() {
        return countryList;
    }

}
