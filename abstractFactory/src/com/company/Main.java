package com.company;

import com.company.factory.IHeroFactory;
import com.company.factory.impl.SwordsmanFactory;
import com.company.factory.impl.WizardFactory;
import com.company.model.concrete.Hero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  private static Hero getHero(final IHeroFactory factory) {
    return new Hero(factory.getWeapon(), factory.getArmor());
  }

  private static void startGame(final List<IHeroFactory> heroFactories) {
    final List<Hero> heroes = heroFactories.stream().map(Main::getHero).collect(Collectors.toList());
    // do smth
  }

  public static void main(String[] args) {
    startGame(Arrays.asList(new WizardFactory(), new SwordsmanFactory()));
  }
}
