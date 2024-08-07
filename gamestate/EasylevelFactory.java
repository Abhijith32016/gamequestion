package gamestate;
public class EasylevelFactory implements  GameElementFactory
{
public Enemy createEnemy()
{
return new GoblinEnemy();
}
public Weapon createWeapon()
{
return new DaggerWeapon();
}
public PowerUp createPowerUp()
{
return new HealthPowerUp();
}
}
