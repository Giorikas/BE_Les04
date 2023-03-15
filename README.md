# Les 04

----------------------

## Versie
<kbd>0.0.1</kbd>

## Opdrachtbeschrijving

Applicatie programmeren die meerdere nieuwe Pokèmon kan aanmaken.

### Opbouw: <kbd>0.0.1</kbd>

<table>
<tr>
<td colspan="5">

- [ ] Mian(..){..}\
  &emsp; met:
  - [ ] Instantiatie van de vier *subklassen* Pokèmon met hun attributen. 
  - [ ] Aanroepen in de `main` methode van verschillende methodes van de verschillende *Pokèmons*, uit zowel de *sub-* 
    als de *superklasse*.  
  

</td>
</tr><tr>
<tr>
<td colspan="5">

- [X] Een Super klasse `public abstract class Pokemon(..){..}`\
&emsp; met *minimaal*:
  - [X] 2 private variabelen: `int hitPoints`, `int experiencePoints`,`int lvl`
  - [X] Public variabelen: `String name`,~~~`int[] arrLevelupXp`~~~
  - [X] 1 constructor: `Pokemon(..){}`
  - [X] 2 methodes: `displayBasePkm(){}`, `displayAvatar(){}`, `attack(){}`\
  - [X] 2 getters: `getName`, `getHitPoints`, `getExperiencePoints`,`getLvl`,`getArrLevelupXp`
  - [X] 2 setters: `setName`, `setHitPoints`, `setExperiencePoints`,`setLvl`,`setArrLevelupXp`


</td>
</tr><tr>
<td>

- [ ] 4 subklassen met minimaal:
    - [ ] 2 private variabelen.
    - [ ] 1 constructor
    - [ ] 2 methodes
    - [ ] 1 override
    - [ ] 2 getters
    - [ ] 2 setters

</td>
<td>

- [X] `Class FirePkm()` <kbd>0.0.1</kbd>
    - [X] `string typeOfPkm`\
    &emsp;`float baseAttack`,\
    &emsp;`float baseDefence`
    - [X] `FirePkm(){}`
    - [X] `firePunch(){}`,\
          &emsp;`pyroBall(){}`
    - [X] `attack(){}` (override)
    - [X] `getBaseAttack`,\
          &emsp;`getBaseDefence`
    - [X] `setBaseAttack`,\
          &emsp;`setBaseDefence`

</td>
<td>

- [X] `Class WaterPkm()` <kbd>0.0.1</kbd>
    - [X] `string typeOfPkm`\
      &emsp;`float baseAttack`,\
      &emsp;`float baseDefence`
    - [X] `WaterPkm()`
    - [X] `hydroCanon()`,\
  &emsp; `surf()`
  - [X] `attack(){}`
  - [X] `getBaseAttack`,\
     &emsp;`getBaseDefence`
  - [X] `setBaseAttack`,\
      &emsp;`setBaseDefence`
</td>
<td>

- [ ] `Class GrassPkm()`
  - [ ] `string typeOfPkm`\
    &emsp;`float baseAttack`,\
    &emsp;`float baseDefence`
    - [ ] `GrassPkm()`
    - [ ] `leafBlade()`,\
      &emsp; `grassBlow()`
  - [ ] `attack(){}`
  - [ ] `getBaseAttack`,\
    &emsp;`getBaseDefence`
  - [ ] `setBaseAttack`,\
    &emsp;`setBaseDefence`
</td>
<td>

- [ ] `Class ElectricPkm()`
- [ ] `string typeOfPkm`\
  &emsp;`float baseAttack`,\
  &emsp;`float baseDefence`
  - [ ] `ElectricPkm()`
  - [ ] `AmpereKick()`,\
    &emsp; `ThunderBall()`
- [ ] `attack(){}`
- [ ] `getBaseAttack`,\
  &emsp;`getBaseDefence`
- [ ] `setBaseAttack`,\
  &emsp;`setBaseDefence`
</td>
</tr>
</table>

## Stappen:
### Voorbereiding <kbd>0.0.1</kbd>
1. Doornemen opdracht en bedenken van hoofdstructuur (Super- en Subklassen) 
1. Opbouw schetsen met randvoorwaarden. 

### Coderen <kbd>0.0.1</kbd>
2. `Public class Pokemon(){}` aangemaakt met parameters zoals hierboven weergegeven. **Niet** abstract.
   - Methode `displayBasePkm(){
    ```java
       public void displayBasePkm(){
        int xp = getExperiencePoints();
        float hp = getHitPoints();
        System.out.printf("Name: %s\nHealth: %s\nExperience: %s",name, hp, xp);
        }  
    ```
1. Klasse Main aangemaakt met daarin:
    ```java
        Pokemon pkm = new Pokemon("Klaas", 100f, 0,0);
        pkm.displayBasePkm();
   ```
1. Compileren en draaien. Gezonde Klaas in beeld, Main en Pokemon doen het; 
1. Pokemon abstract maken.
1. FirePkm maken. (vars, constructor, override `attack` met een System.out.println("Attack!"))
1. Main Klaas eruit... `Pokemon Pyro = new FirePkm("Pyro", 100f, 0,0, "Fire", 17, 7);`
1. Draaien... Werkt :smile:
1. Pyro uitgebreid tot alle vinkjes van   


## Bonusopdrachten

1. Bedenk of het mogelijk zou zijn om een abstracte klasse te implementeren in deze appplicatie. En zo ja, implementeer deze abstracte klasse dan in jouw project;
2. Bedenk of het mogelijk zou zijn om één of meer abstracte methodes te implementeren. En zo ja, implementeer deze!
3. Probeer een manier te vinden waardoor één Pokèmon twee verschillende types tegelijk zou kunnen zijn. Kun je dit implementeren?


### Spel -- Brainstormgedeelte als extra op bonus...?
#### Verhoudingen in Aanval en verdediging tussen de verschillende typen.
      
<table> 
<tr>
<td>
<b>Aanval</b>

| &emsp;&darr; vs  &rarr; &emsp; | 🔥  | 🌊  | 🌿  | ⚡   |
|-------------------------------|-----|-----|-----|-----|
| fire 🔥                       | 0.5 | 0.5 | 2.0 | 1.0 |
| water 🌊                      | 2.0 | 1.0 | 0.5 | 1.0 | 
| grass 🌿                      | 0.5 | 1.5 | 1.0 | 1.0 |
| Electric ⚡                    | 1.0 | 2.0 | 0.5 | 0.5 |

</td>
<td>
<b>Verdediging</b> 

| &darr; defend from &rarr; | 🔥  | 🌊  | 🌿  | ⚡   |
|---------------------------|-----|-----|-----|-----|
| fire 🔥                   | 1.5 | 0.5 | 2.0 | 1.0 |
| water 🌊                  | 2.0 | 1.0 | 0.5 | 0.5 |
| grass 🌿                  | 0.5 | 1.5 | 1.0 | 1.0 |
| Electric ⚡                | 1.0 | 1.0 | 1.0 | 0.5 |

</td>
</tr>
</table>

### ...

Methode  `levelUP` met als variabele: `int[] arrLevelupXp`

Attack actions: `HashMap<String, float>` \
Methods:
- `Attack()`
- `ShowAvailableAttacks(..){..}`
- `UseAttack(ChoosenMethod){}`
- accuracy ???


Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.
