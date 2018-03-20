package com.company.model;

public abstract class AbstractArmor {

  private final int weight;

  public AbstractArmor(final int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public abstract int getPhysicalAttackProtection();

  public abstract int getMagicResistance();
}
