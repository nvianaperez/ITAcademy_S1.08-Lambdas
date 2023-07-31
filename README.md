
<h1 align="center">Java lambdas and streams</h1>
<h3 align="center">Bootcamp IT Academy - Sprint 1.8</h3>


<img src="https://visitor-badge.laobi.icu/badge?page_id=nvianaperez.ITAcademy_S1.08-Lambdas" />
<br><br>

<h3>Level 1</h3>
- Exercici 1 <br>
  A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
<br><br>
- Exercici 2 <br>
  Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
<br><br>
- Exercici 3 <br>
  Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
<br><br>
- Exercici 4 <br>
  Fer la mateixa impressió del punt anterior, però mitjançant method reference.
<br><br>
- Exercici 5 <br>
  Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.
<br><br>
- Exercici 6 <br>
  Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
<br><br>
- Exercici 7 <br>
  Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
<br><br>
- Exercici 8 <br>
  Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
<br><br>  

<h3>Level 2</h3>
- Exercici 1 <br>
  Crea una llista de cadenes amb noms propis. Escriu un mètode que retorna una llista de totes les cadenes que comencen amb la lletra 'A' (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.
<br><br>
- Exercici 2 <br>
  Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers. Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell. Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.
<br><br>
- Exercici 3 <br>
  Crea una Functional Interface que contingui un mètode anomenat operacio(). Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que es pugui transformar l’operació amb una suma, una resta, una multiplicació i una divisió.
<br><br>
- Exercici 4 <br>
  Crea una llista que contingui algunes cadenes de text i nombres.
  Ordena-les per:Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)
  Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.  
  Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
  Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings). 
<br><br>

<h3>Level 3</h3>
- Exercici 1 <br>
  Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.

  Omple una llista amb 10 alumnes

  Mostra per pantalla el nom i l’edat de cada alumne/a.
  Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes).
  Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
  Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.  
  Mostra tots els alumnes que fan JAVA i són majors d’edat.
