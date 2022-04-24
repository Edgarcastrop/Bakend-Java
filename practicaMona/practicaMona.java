package Tareas;         // un pulpo con cabeza de gato  clave de herencia -> "es un"

class octocats{
    String color, colorcara, colormanchas;
    int tentaculos, manchas;

    octocats(String color, String colorcara, String colormanchas, int tentaculos, int manchas){
        this.color = color;
        this.colorcara = colorcara;
        this.colormanchas = colormanchas;
        this.tentaculos = tentaculos;
        this.manchas = manchas;
    }
}

public class Herencia extends octocats{
    String nombre, vestimenta, colorvestimeta;
    int id, calificacion;

    public Herencia(int id, String nombre, String color,String colorcara, int manchas, String colormanchas,
                    int tentaculos, String vestimeta, String colorvestimeta, int calificacion) {
        super(color, colorcara,colormanchas , manchas , tentaculos);
        this.id = id;
        this.nombre = nombre;
        this.vestimenta = vestimeta;
        this.colorvestimeta = colorvestimeta;
        this.calificacion = calificacion;
    }

    void detailsBoxertocat (){
        System.out.println("#"+id+
                " "+nombre+"\n"+
                "Su color es: "+color+"\n"+
                "Su color de cara es: "+colorcara+"\n"+
                "Tiene "+manchas+" manchas en total\n"+
                "El color de las manchas son: "+colormanchas+"\n"+
                "Tiene "+tentaculos+" tentaculos en total\n"+
                "Su vestimenta es: "+vestimenta+"\n"+
                "Ambos son de color: "+colorvestimeta+"\n"+
                "En lo personal le doy una calificacion de: "+calificacion+"\n");
    }
}

class Herencia1 extends octocats {
    String nombre1, accesorio, colorparaguas1;
    int calificacion1, id;

    public Herencia1(int id, String nombre1, String color, String colorcara, int manchas, String colormanchas,
                     int tentaculos, String accesorio, String colorparaguas1, int calificacion1) {
        super(color, colorcara, colormanchas, manchas, tentaculos);
        this.id = id;
        this.nombre1 = nombre1;
        this.accesorio = accesorio;
        this.colorparaguas1 = colorparaguas1;
        this.calificacion1 = calificacion1;
    }

    void detailsUmbrellatocat() {
        System.out.println("#"+id+
                " "+nombre1 + "\n" +
                "Su color es: " + color + "\n" +
                "Su color de cara es: " + colorcara + "\n" +
                "Tiene " + manchas + " manchas en total\n" +
                "El color de las manchas son: " + colormanchas + "\n" +
                "Tiene " + tentaculos + " tentaculos en total\n" +
                "Su accesorio es: " + accesorio + "\n" +
                "El color del paraguas es de color: " + colorparaguas1 + "\n" +
                "En lo personal le doy una calificacion de: " + calificacion1+ "\n");
    }
}

class Herencia2 extends octocats {
    String nombre2, accesorios, colorcamisa;
    int calificacion2, id;

    public Herencia2(int id, String nombre2, String color, String colorcara, int manchas, String colormanchas,
                     int tentaculos, String accesorios, String colorcamisa, int calificacion2) {
        super(color, colorcara, colormanchas, manchas, tentaculos);
        this.id = id;
        this.nombre2 = nombre2;
        this.accesorios = accesorios;
        this.colorcamisa = colorcamisa;
        this.calificacion2 = calificacion2;
    }

    void detailsSteroidtocat() {
        System.out.println("#"+id+
                " "+nombre2+"\n" +
                "Su color es: " + color + "\n" +
                "Su color de cara es: " + colorcara + "\n" +
                "Tiene " + manchas + " manchas en total\n" +
                "El color de las manchas son: " + colormanchas + "\n" +
                "Tiene " + tentaculos + " tentaculos en total\n" +
                "Sus accesorios son: " + accesorios + "\n" +
                "El color del paraguas es de color: " + colorcamisa + "\n" +
                "En lo personal le doy una calificacion de: " + calificacion2+ "\n");
    }
}
class Herencia3 extends octocats {
    String nombre3, accesorios, colorcamisa, vestimenta, colorgorro, colormochila, colorshort;
    int calificacion3, id;

    public Herencia3(int id, String nombre3, String color, String colorcara, int manchas, String colormanchas,
                     int tentaculos, String accesorios, String colorcamisa, String vestimenta, String colorgorro,
                     String colormochila, String colorshort, int calificacion3) {
        super(color, colorcara, colormanchas, manchas, tentaculos);
        this.id = id;
        this.nombre3 = nombre3;
        this.accesorios = accesorios;
        this.colorcamisa = colorcamisa;
        this.vestimenta = vestimenta;
        this.colorgorro = colorgorro;
        this.colormochila = colormochila;
        this.colorshort = colorshort;
        this.calificacion3 = calificacion3;
    }

    void detailsAdventureCat() {
        System.out.println("#"+id+
                " "+nombre3 + "\n" +
                "Su color es: " + color + "\n" +
                "Su color de cara es: " + colorcara + "\n" +
                "Tiene " + manchas + " manchas en total\n" +
                "El color de las manchas son: " + colormanchas + "\n" +
                "Tiene " + tentaculos + " tentaculos en total\n" +
                "Sus accesorios son: " + accesorios + "\n" +
                "Su vestimenta es: "+vestimenta+"\n"+
                "El color del gorro es: "+colorgorro+
                "\nEl color de la mochila es: "+colormochila+
                "\nEl color de su short es: "+colorshort+
                "El color del paraguas es de color: " + colorcamisa + "\n" +
                "En lo personal le doy una calificacion de: " + calificacion3+ "\n");
    }
}


class Herencia4 extends octocats {
    String nombre4, accesorios, colorcasco;
    int calificacion4, id;

    public Herencia4(int id, String nombre4, String color, String colorcara, int manchas, String colormanchas,
                     int tentaculos, String accesorios, String colorcasco, int calificacion4) {
        super(color, colorcara, colormanchas, manchas, tentaculos);
        this.id = id;
        this.nombre4 = nombre4;
        this.accesorios = accesorios;
        this.colorcasco = colorcasco;
        this.calificacion4 = calificacion4;
    }

    void detailsconstructocat() {
        System.out.println("#"+id+
                " "+nombre4+"\n" +
                "Su color es: " + color + "\n" +
                "Su color de cara es: " + colorcara + "\n" +
                "Tiene " + manchas + " manchas en total\n" +
                "El color de las manchas son: " + colormanchas + "\n" +
                "Tiene " + tentaculos + " tentaculos en total\n" +
                "Sus accesorios son: " + accesorios + "\n" +
                "El color del casco es: "+colorcasco+
                "\nEn lo personal le doy una calificacion de: " + calificacion4+ "\n");
    }
}

class Herencia5 extends octocats {
    String nombre5, accesorios, colorcamisa, colorbandana, colorshort, colortenis;
    int calificacion5, id;

    public Herencia5(int id, String nombre5, String color, String colorcara, int manchas, String colormanchas,
                     int tentaculos, String accesorios, String colorcamisa, String colorbandana, String colorshort,
                     String colortenis, int calificacion5) {
        super(color, colorcara, colormanchas, manchas, tentaculos);
        this.id = id;
        this.nombre5 = nombre5;
        this.accesorios = accesorios;
        this.colorbandana = colorbandana;
        this.colorcamisa = colorcamisa;
        this.colorshort = colorshort;
        this.colortenis = colortenis;
        this.calificacion5 = calificacion5;
    }

    void detailsDodgeDuckDipDiveDodgetocat() {
        System.out.println("#"+id+
                " "+nombre5+"\n" +
                "Su color es: " + color + "\n" +
                "Su color de cara es: " + colorcara + "\n" +
                "Tiene " + manchas + " manchas en total\n" +
                "El color de las manchas son: " + colormanchas + "\n" +
                "Tiene " + tentaculos + " tentaculos en total\n" +
                "Sus accesorios son: " + accesorios + "\n" +
                "El color de la bandana es: "+colorbandana+
                "\nEl color de la camisa es: "+colorcamisa+
                "\nEl color del short es: "+colorshort+
                "\nTiene unos tenisones de color: "+colortenis+
                "\nEn lo personal le doy una calificacion de: " + calificacion5+ "\n");
    }
}




class mostrar{
    public static void main(String[] args) {
        Herencia herencia = new Herencia(139,"Boxertocat", "Negro","Piel", 9,
                "Azul", 5, "Guantes de box y una bandana", "Rojo", 10);
        herencia.detailsBoxertocat();

        Herencia1 herencia1 = new Herencia1(140,"Umbrella to cat" ,"Negro", "Piel",
                4, "Azul", 5, "Un paraguas", "Morado", 8);
        herencia1.detailsUmbrellatocat();

        Herencia2 herencia2 = new Herencia2(106, "Steroid to Cat", "Negro", "Piel",
                9, "Azul", 5, "Unos lentes negros y una camisa", "Gris",
                9);
        herencia2.detailsSteroidtocat();

        Herencia3 herencia3 = new Herencia3(68, "Adventure Cat", "Negro", "Piel",
                9, "Blancos", 5, "Una espada, y una mochila", "Azul",
                "Una camisa, un gorro y un short", "Blanco", "Verde","Azul",
                10);
        herencia3.detailsAdventureCat();

        Herencia4 herencia4 = new Herencia4(30, "Constructo Cat", "Negro", "Piel",
                9, "Blanco", 5, "Un casco de construccion y una llave","Amarillo",
                7);
        herencia4.detailsconstructocat();

        Herencia5 herencia5 = new Herencia5(40, " Dodge, Duck, Dip, Dive, Dodgetocat", "Negro",
                "Piel", 7, "Blanco", 5, "Una bandana",
                "Amarilla","Azul","Azul","Amarilla", 8 );
        herencia5.detailsDodgeDuckDipDiveDodgetocat();
    }
}
