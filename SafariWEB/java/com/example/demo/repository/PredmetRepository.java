package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Kategorija;
import model.Predmet;
import model.Stanje;

public interface PredmetRepository extends JpaRepository<Predmet, Integer> {
	List<Predmet> findByKategorija(Kategorija kat);
	List<Predmet> findByStanje(Stanje s);
	List<Predmet> findByNaziv(String naziv);
}
