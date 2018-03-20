package com.company.model.concrete.heroes;

import com.company.model.AbstractHero;
import com.company.model.AbstractSummon;
import com.company.model.concrete.companions.Warrior;

public class Paladin extends AbstractHero {

  @Override
  public AbstractSummon summon() {
    return new Warrior();
  }
}
