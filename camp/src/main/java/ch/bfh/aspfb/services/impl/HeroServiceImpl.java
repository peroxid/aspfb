package ch.bfh.aspfb.services.impl;


import ch.bfh.aspfb.model.Hero;
import ch.bfh.aspfb.repository.HeroRepository;
import ch.bfh.aspfb.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HeroServiceImpl implements HeroService {
    private Random random = new Random();

    @Autowired
    private HeroRepository heroRepository;


    public Hero createHero(String name) {
        final Hero hero = new Hero();
        hero.setName(name);
        hero.setAtk(random.nextInt(100));
        hero.setDef(random.nextInt(100));
        hero.setHp(100);
        System.out.println(String.format("Created hero: %s", hero.toString()));
        return heroRepository.save(hero);
    }
}
