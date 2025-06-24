import java.util.ArrayList;
import java.util.Random;

public class FragenSpeicher {
	private String[] fragenListe = new String[50];
	private String[] antwort1 = new String[50];
	private String[] antwort2 = new String[50];
	private String[] antwort3 = new String[50];
	private String[] antwort4 = new String[50];
	private Integer[] richtigeAntwort = new Integer[50];	
	private ArrayList<Integer> schonFragenListe = new ArrayList<Integer>();
	private Random ran = new Random();
	private int random;
	
	public FragenSpeicher() {
		Listebefuellen();
	}
	
	public void Listebefuellen() {
		fragenListe[0] = "Was ist die Hauptstadt von Australien?";
	    antwort1[0] = "Sydney";
	    antwort2[0] = "Melbourne";
	    antwort3[0] = "Canberra";
	    antwort4[0] = "Perth";
	    richtigeAntwort[0] = 3;

	    fragenListe[1] = "Wie viele Kontinente gibt es auf der Erde?";
	    antwort1[1] = "5";
	    antwort2[1] = "6";
	    antwort3[1] = "7";
	    antwort4[1] = "8";
	    richtigeAntwort[1] = 3;

	    fragenListe[2] = "Welches dieser Tiere legt Eier?";
	    antwort1[2] = "Wal";
	    antwort2[2] = "Delfin";
	    antwort3[2] = "Ameisenbär";
	    antwort4[2] = "Schnabeltier";
	    richtigeAntwort[2] = 4;

	    fragenListe[3] = "Wie heißt der höchste Berg der Welt?";
	    antwort1[3] = "Mount Everest";
	    antwort2[3] = "K2";
	    antwort3[3] = "Kilimandscharo";
	    antwort4[3] = "Mont Blanc";
	    richtigeAntwort[3] = 1;

	    fragenListe[4] = "Welches chemische Element hat das Symbol 'O'?";
	    antwort1[4] = "Gold";
	    antwort2[4] = "Sauerstoff";
	    antwort3[4] = "Osmium";
	    antwort4[4] = "Ozon";
	    richtigeAntwort[4] = 2;

	    fragenListe[5] = "Wer schrieb das berühmte Werk 'Faust'?";
	    antwort1[5] = "Friedrich Schiller";
	    antwort2[5] = "Johann Wolfgang von Goethe";
	    antwort3[5] = "Thomas Mann";
	    antwort4[5] = "Bertolt Brecht";
	    richtigeAntwort[5] = 2;

	    fragenListe[6] = "Welcher Planet wird oft als 'Roter Planet' bezeichnet?";
	    antwort1[6] = "Venus";
	    antwort2[6] = "Jupiter";
	    antwort3[6] = "Mars";
	    antwort4[6] = "Merkur";
	    richtigeAntwort[6] = 3;

	    fragenListe[7] = "Wie viele Minuten hat eine Stunde?";
	    antwort1[7] = "30";
	    antwort2[7] = "45";
	    antwort3[7] = "60";
	    antwort4[7] = "90";
	    richtigeAntwort[7] = 3;

	    fragenListe[8] = "Was ist die Quadratwurzel von 144?";
	    antwort1[8] = "10";
	    antwort2[8] = "12";
	    antwort3[8] = "14";
	    antwort4[8] = "16";
	    richtigeAntwort[8] = 2;

	    fragenListe[9] = "Welches dieser Länder liegt nicht in Europa?";
	    antwort1[9] = "Spanien";
	    antwort2[9] = "Kanada";
	    antwort3[9] = "Italien";
	    antwort4[9] = "Polen";
	    richtigeAntwort[9] = 2;
	    
	    fragenListe[10] = "Welches Land hat die größte Bevölkerung?";
	    antwort1[10] = "USA";
	    antwort2[10] = "Indien";
	    antwort3[10] = "China";
	    antwort4[10] = "Brasilien";
	    richtigeAntwort[10] = 3;

	    fragenListe[11] = "Wer malte die Mona Lisa?";
	    antwort1[11] = "Vincent van Gogh";
	    antwort2[11] = "Claude Monet";
	    antwort3[11] = "Leonardo da Vinci";
	    antwort4[11] = "Pablo Picasso";
	    richtigeAntwort[11] = 3;

	    fragenListe[12] = "Wie viele Spieler hat eine Fußballmannschaft auf dem Feld?";
	    antwort1[12] = "9";
	    antwort2[12] = "10";
	    antwort3[12] = "11";
	    antwort4[12] = "12";
	    richtigeAntwort[12] = 3;

	    fragenListe[13] = "Welcher Planet ist der größte im Sonnensystem?";
	    antwort1[13] = "Mars";
	    antwort2[13] = "Jupiter";
	    antwort3[13] = "Saturn";
	    antwort4[13] = "Neptun";
	    richtigeAntwort[13] = 2;

	    fragenListe[14] = "Welches Jahr markierte das Ende des Zweiten Weltkriegs?";
	    antwort1[14] = "1943";
	    antwort2[14] = "1944";
	    antwort3[14] = "1945";
	    antwort4[14] = "1946";
	    richtigeAntwort[14] = 3;

	    fragenListe[15] = "Wie viele Knochen hat ein erwachsener Mensch?";
	    antwort1[15] = "196";
	    antwort2[15] = "206";
	    antwort3[15] = "216";
	    antwort4[15] = "226";
	    richtigeAntwort[15] = 2;

	    fragenListe[16] = "Wie heißt die griechische Göttin der Weisheit?";
	    antwort1[16] = "Aphrodite";
	    antwort2[16] = "Athene";
	    antwort3[16] = "Hera";
	    antwort4[16] = "Artemis";
	    richtigeAntwort[16] = 2;

	    fragenListe[17] = "Wer entdeckte die Relativitätstheorie?";
	    antwort1[17] = "Isaac Newton";
	    antwort2[17] = "Nikola Tesla";
	    antwort3[17] = "Albert Einstein";
	    antwort4[17] = "Galileo Galilei";
	    richtigeAntwort[17] = 3;

	    fragenListe[18] = "Welches ist das längste Fluss-System der Welt?";
	    antwort1[18] = "Nil";
	    antwort2[18] = "Amazonas";
	    antwort3[18] = "Jangtse";
	    antwort4[18] = "Mississippi";
	    richtigeAntwort[18] = 2;

	    fragenListe[19] = "Welche Farbe hat die Haut eines Eisbären unter seinem Fell?";
	    antwort1[19] = "Weiß";
	    antwort2[19] = "Schwarz";
	    antwort3[19] = "Grau";
	    antwort4[19] = "Rosa";
	    richtigeAntwort[19] = 2;

	    fragenListe[20] = "Wie viele Tasten hat ein Standard-Klavier?";
	    antwort1[20] = "76";
	    antwort2[20] = "80";
	    antwort3[20] = "88";
	    antwort4[20] = "92";
	    richtigeAntwort[20] = 3;

	    fragenListe[21] = "Welches Element wird auch als 'König der Metalle' bezeichnet?";
	    antwort1[21] = "Silber";
	    antwort2[21] = "Gold";
	    antwort3[21] = "Platin";
	    antwort4[21] = "Titan";
	    richtigeAntwort[21] = 2;

	    fragenListe[22] = "Wie viele Wochen hat ein Jahr?";
	    antwort1[22] = "50";
	    antwort2[22] = "51";
	    antwort3[22] = "52";
	    antwort4[22] = "53";
	    richtigeAntwort[22] = 3;

	    fragenListe[23] = "Welcher ist der kälteste Planet in unserem Sonnensystem?";
	    antwort1[23] = "Neptun";
	    antwort2[23] = "Uranus";
	    antwort3[23] = "Saturn";
	    antwort4[23] = "Pluto";
	    richtigeAntwort[23] = 2;

	    fragenListe[24] = "Welche Stadt wird als 'ewige Stadt' bezeichnet?";
	    antwort1[24] = "Paris";
	    antwort2[24] = "Athen";
	    antwort3[24] = "Rom";
	    antwort4[24] = "London";
	    richtigeAntwort[24] = 3;

	    fragenListe[25] = "Wie viele Planeten hat unser Sonnensystem?";
	    antwort1[25] = "7";
	    antwort2[25] = "8";
	    antwort3[25] = "9";
	    antwort4[25] = "10";
	    richtigeAntwort[25] = 2;

	    fragenListe[26] = "Welche ist die größte Wüste der Welt?";
	    antwort1[26] = "Gobi";
	    antwort2[26] = "Sahara";
	    antwort3[26] = "Antarktische Wüste";
	    antwort4[26] = "Kalahari";
	    richtigeAntwort[26] = 3;

	    fragenListe[27] = "Wer schrieb 'Harry Potter'?";
	    antwort1[27] = "J.R.R. Tolkien";
	    antwort2[27] = "George R.R. Martin";
	    antwort3[27] = "J.K. Rowling";
	    antwort4[27] = "Stephen King";
	    richtigeAntwort[27] = 3;

	    fragenListe[28] = "Was ist das kleinste Land der Welt?";
	    antwort1[28] = "Monaco";
	    antwort2[28] = "San Marino";
	    antwort3[28] = "Vatikanstadt";
	    antwort4[28] = "Liechtenstein";
	    richtigeAntwort[28] = 3;

	    fragenListe[29] = "Wie viele Seiten hat ein Würfel?";
	    antwort1[29] = "4";
	    antwort2[29] = "6";
	    antwort3[29] = "8";
	    antwort4[29] = "10";
	    richtigeAntwort[29] = 2;
	    
	    fragenListe[30] = "Welche Farbe hat ein Smaragd?";
	    antwort1[30] = "Rot";
	    antwort2[30] = "Grün";
	    antwort3[30] = "Blau";
	    antwort4[30] = "Gelb";
	    richtigeAntwort[30] = 2;

	    fragenListe[31] = "Wer war der erste Mensch auf dem Mond?";
	    antwort1[31] = "Buzz Aldrin";
	    antwort2[31] = "Yuri Gagarin";
	    antwort3[31] = "Neil Armstrong";
	    antwort4[31] = "Michael Collins";
	    richtigeAntwort[31] = 3;

	    fragenListe[32] = "Wie viele Ringe sind auf der olympischen Flagge?";
	    antwort1[32] = "3";
	    antwort2[32] = "4";
	    antwort3[32] = "5";
	    antwort4[32] = "6";
	    richtigeAntwort[32] = 3;

	    fragenListe[33] = "Was ist das chemische Symbol für Gold?";
	    antwort1[33] = "Go";
	    antwort2[33] = "Au";
	    antwort3[33] = "Ag";
	    antwort4[33] = "Gd";
	    richtigeAntwort[33] = 2;

	    fragenListe[34] = "In welchem Jahr fiel die Berliner Mauer?";
	    antwort1[34] = "1987";
	    antwort2[34] = "1989";
	    antwort3[34] = "1991";
	    antwort4[34] = "1993";
	    richtigeAntwort[34] = 2;

	    fragenListe[35] = "Wie heißt die Hauptstadt von Kanada?";
	    antwort1[35] = "Toronto";
	    antwort2[35] = "Vancouver";
	    antwort3[35] = "Ottawa";
	    antwort4[35] = "Montreal";
	    richtigeAntwort[35] = 3;

	    fragenListe[36] = "Wie viele Seiten hat ein Pentagon?";
	    antwort1[36] = "4";
	    antwort2[36] = "5";
	    antwort3[36] = "6";
	    antwort4[36] = "8";
	    richtigeAntwort[36] = 2;

	    fragenListe[37] = "Wer schrieb 'Die Odyssee'?";
	    antwort1[37] = "Sokrates";
	    antwort2[37] = "Homer";
	    antwort3[37] = "Platon";
	    antwort4[37] = "Aristoteles";
	    richtigeAntwort[37] = 2;

	    fragenListe[38] = "Was ist der höchste Wasserfall der Welt?";
	    antwort1[38] = "Niagarafälle";
	    antwort2[38] = "Viktoriafälle";
	    antwort3[38] = "Iguazú-Wasserfälle";
	    antwort4[38] = "Angel Falls";
	    richtigeAntwort[38] = 4;

	    fragenListe[39] = "Wie viele Zähne hat ein erwachsener Mensch normalerweise?";
	    antwort1[39] = "28";
	    antwort2[39] = "30";
	    antwort3[39] = "32";
	    antwort4[39] = "34";
	    richtigeAntwort[39] = 3;

	    fragenListe[40] = "Welches Tier ist das größte Landsäugetier?";
	    antwort1[40] = "Nashorn";
	    antwort2[40] = "Elefant";
	    antwort3[40] = "Giraffe";
	    antwort4[40] = "Nilpferd";
	    richtigeAntwort[40] = 2;

	    fragenListe[41] = "Welcher Kontinent ist gleichzeitig ein Land?";
	    antwort1[41] = "Afrika";
	    antwort2[41] = "Australien";
	    antwort3[41] = "Südamerika";
	    antwort4[41] = "Europa";
	    richtigeAntwort[41] = 2;

	    fragenListe[42] = "Welcher Fluss fließt durch Ägypten?";
	    antwort1[42] = "Euphrat";
	    antwort2[42] = "Amazonas";
	    antwort3[42] = "Nil";
	    antwort4[42] = "Ganges";
	    richtigeAntwort[42] = 3;

	    fragenListe[43] = "Wie viele Spieler sind in einer Baseballmannschaft auf dem Feld?";
	    antwort1[43] = "7";
	    antwort2[43] = "8";
	    antwort3[43] = "9";
	    antwort4[43] = "10";
	    richtigeAntwort[43] = 3;

	    fragenListe[44] = "Welche Stadt liegt auf zwei Kontinenten?";
	    antwort1[44] = "Istanbul";
	    antwort2[44] = "Moskau";
	    antwort3[44] = "Kairo";
	    antwort4[44] = "London";
	    richtigeAntwort[44] = 1;

	    fragenListe[45] = "Wie viele Herzen hat ein Oktopus?";
	    antwort1[45] = "1";
	    antwort2[45] = "2";
	    antwort3[45] = "3";
	    antwort4[45] = "4";
	    richtigeAntwort[45] = 3;

	    fragenListe[46] = "Was ist das Symbol für die römische Zahl 1000?";
	    antwort1[46] = "C";
	    antwort2[46] = "D";
	    antwort3[46] = "M";
	    antwort4[46] = "X";
	    richtigeAntwort[46] = 3;

	    fragenListe[47] = "Was ist die Hauptstadt von Brasilien?";
	    antwort1[47] = "São Paulo";
	    antwort2[47] = "Rio de Janeiro";
	    antwort3[47] = "Brasília";
	    antwort4[47] = "Salvador";
	    richtigeAntwort[47] = 3;

	    fragenListe[48] = "Wie heißt die größte Insel der Welt?";
	    antwort1[48] = "Australien";
	    antwort2[48] = "Grönland";
	    antwort3[48] = "Madagaskar";
	    antwort4[48] = "Neuguinea";
	    richtigeAntwort[48] = 2;

	    fragenListe[49] = "Wie viele Beine hat eine Spinne?";
	    antwort1[49] = "6";
	    antwort2[49] = "8";
	    antwort3[49] = "10";
	    antwort4[49] = "12";
	    richtigeAntwort[49] = 2;
	}
	
	public String GetFrage() {
		Random ran = new Random();
		random = ran.nextInt(50);
		return fragenListe[random];
	}
	public String GetAntwort1() {
		return antwort1[random];
	}
	public String GetAntwort2() {
		return antwort2[random];
	}
	public String GetAntwort3() {
		return antwort3[random];
	}
	public String GetAntwort4() {
		return antwort4[random];
	}
	public int GetRichtigeAntwort() {
		return richtigeAntwort[random];
	}
}
