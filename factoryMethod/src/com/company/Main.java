package com.company;

import com.company.model.AbstractHero;
import com.company.model.concrete.heroes.Paladin;
import com.company.model.concrete.heroes.Zooman;

public class Main {

  private static void summonize(final AbstractHero hero) {
    System.out.println(hero.summon().getQuote());
  }

  public static void main(String[] args) {
    summonize(new Paladin());
    summonize(new Zooman());
  }
}
