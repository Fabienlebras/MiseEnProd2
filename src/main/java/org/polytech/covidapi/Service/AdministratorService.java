package org.polytech.covidapi.Service;

import org.polytech.covidapi.Model.Administrator;
import org.polytech.covidapi.Repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    public Iterable<Administrator> getVaccination() {
        return administratorRepository.findAll();
    }

    public void save(Administrator administrator) {
        administratorRepository.save(administrator);

    }

    public void delete(long id) {
        administratorRepository.deleteById(id);
    }

    public void update(Administrator administrator) {

        if (administratorRepository.existsById(administrator.getId())) {
            administratorRepository.save(administrator);
        }

    }

}
