package com.company;

public class Weapon {

    private final String name;
    private final String team;
    private final int cost;
    private final int award;
    private final double rebuy;
    private final int speed;
    private final int rate;
    private final int damage;
    private final int dps;
    private final double armorP;
    private final int penetration;
    private final int range;
    private final int clip;
    private final int ammo;
    private final double reloadC;
    private final double reloadR;
    private final double recoil;
    private final int recoilV;
    private final int recoilH;
    private final double spread;
    private final double spreadR;
    private final double spreadS;
    private final double spreadC;

    public Weapon(String name, String team, int cost, int award, double rebuy, int speed, int rate, int damage, int dps, double armorP, int penetration, int range, int clip, int ammo, double reloadC, double reloadR, double recoil, int recoilV, int recoilH, double spread, double spreadR, double spreadS, double spreadC) {
        this.name = name;
        this.team = team;
        this.cost = cost;
        this.award = award;
        this.rebuy = rebuy;
        this.speed = speed;
        this.rate = rate;
        this.damage = damage;
        this.dps = dps;
        this.armorP = armorP;
        this.penetration = penetration;
        this.range = range;
        this.clip = clip;
        this.ammo = ammo;
        this.reloadC = reloadC;
        this.reloadR = reloadR;
        this.recoil = recoil;
        this.recoilV = recoilV;
        this.recoilH = recoilH;
        this.spread = spread;
        this.spreadR = spreadR;
        this.spreadS = spreadS;
        this.spreadC = spreadC;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getCost() {
        return cost;
    }

    public int getAward() {
        return award;
    }

    public double getRebuy() {
        return rebuy;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRate() {
        return rate;
    }

    public int getDamage() {
        return damage;
    }

    public int getDps() {
        return dps;
    }

    public double getArmorP() {
        return armorP;
    }

    public int getPenetration() {
        return penetration;
    }

    public int getRange() {
        return range;
    }

    public int getClip() {
        return clip;
    }

    public int getAmmo() {
        return ammo;
    }

    public double getReloadC() {
        return reloadC;
    }

    public double getReloadR() {
        return reloadR;
    }

    public double getRecoil() {
        return recoil;
    }

    public int getRecoilV() {
        return recoilV;
    }

    public int getRecoilH() {
        return recoilH;
    }

    public double getSpread() {
        return spread;
    }

    public double getSpreadR() {
        return spreadR;
    }

    public double getSpreadS() {
        return spreadS;
    }

    public double getSpreadC() {
        return spreadC;
    }
}
