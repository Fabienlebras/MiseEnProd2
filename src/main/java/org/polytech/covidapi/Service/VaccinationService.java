package org.polytech.covidapi.Service;

import org.polytech.covidapi.Model.Vaccination;
import org.polytech.covidapi.Repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {

    @Autowired
    private VaccinationRepository vaccinationRepository;

    public Iterable<Vaccination> getVaccination() {
        return vaccinationRepository.findAll();
    }

    public void save(Vaccination vaccination) {
        vaccinationRepository.save(vaccination);

    }

    public void delete(long id) {
        vaccinationRepository.deleteById(id);
    }

    public void update(Vaccination vaccination) {

        if (vaccinationRepository.existsById(vaccination.getId())) {
            vaccinationRepository.save(vaccination);
        } 

    }


}
