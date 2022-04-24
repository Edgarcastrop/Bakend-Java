package Tareas;

class Harrypoter {

    public static void main(String[] args) {
        show();
    }
    public static void show(){
        contenidoersonajes harry = new contenidoersonajes();
        harry.setNombre("Harry Potter");
        contenidoersonajes gener = new contenidoersonajes();
        gener.setGenero("Hombre");
        contenidoersonajes casita = new contenidoersonajes();
        casita.setCasa("Gryffindor");
        contenidoersonajes miedo = new contenidoersonajes();
        miedo.setBoggart("Dementor");
        contenidoersonajes patronous = new contenidoersonajes();
        patronous.setPatronus("Siervo macho");

        contenidoersonajes Hermione = new contenidoersonajes();
        Hermione.setNombre("Hermione Granger");
        contenidoersonajes gener1 = new contenidoersonajes();
        gener1.setGenero("Mujer");
        contenidoersonajes casita1 = new contenidoersonajes();
        casita1.setCasa("Gryffindor");
        contenidoersonajes miedo1 = new contenidoersonajes();
        miedo1.setBoggart("La profesora McGonagall");
        contenidoersonajes patronous1 = new contenidoersonajes();
        patronous1.setPatronus("Nutria");

        contenidoersonajes Lupin = new contenidoersonajes();
        Lupin.setNombre("Remus Lupin");
        contenidoersonajes gener2 = new contenidoersonajes();
        gener2.setGenero("Hombre");
        contenidoersonajes casita2 = new contenidoersonajes();
        casita2.setCasa("Gryffindor");
        contenidoersonajes miedo2 = new contenidoersonajes();
        miedo2.setBoggart("La luna llena");
        contenidoersonajes patronous2 = new contenidoersonajes();
        patronous2.setPatronus("Lobo");

        contenidoersonajes Snape = new contenidoersonajes();
        Snape.setNombre("Severus Snape");
        contenidoersonajes gener3 = new contenidoersonajes();
        gener3.setGenero("Hombre");
        contenidoersonajes casita3 = new contenidoersonajes();
        casita3.setCasa("Slytherin");
        contenidoersonajes miedo3 = new contenidoersonajes();
        miedo3.setBoggart("Lord Voldemort");
        contenidoersonajes patronous3 = new contenidoersonajes();
        patronous3.setPatronus("Siervo mujer");

        contenidoersonajes Voldemor = new contenidoersonajes();
        Voldemor.setNombre("Lord Voldemort");
        contenidoersonajes gener4 = new contenidoersonajes();
        gener4.setGenero("Hombre");
        contenidoersonajes casita4 = new contenidoersonajes();
        casita4.setCasa("Slytherin");
        contenidoersonajes miedo4 = new contenidoersonajes();
        miedo4.setBoggart("Verse muerto el mismo");
        contenidoersonajes patronous4 = new contenidoersonajes();
        patronous4.setPatronus("No tiene, pero tiene una serpiente siempre");

        String msg;
        msg = "Los personajes que se modularon fueron: \n"+ "-----"+harry.getNombre()+"-----"+"\n"+
        "Su genero es: "+ gener.getGenero()+"\n"+
        "Su casa es: "+ casita.getCasa()+"\n"+
        "Su boggart es: "+miedo.getBoggart() +"\n"+
        "Su patronus es: "+patronous.getPatronus()+"\n"+
                "\n \n"+ "-----"+Hermione.getNombre()+"-----"+"\n"+
                "Su genero es: "+ gener1.getGenero()+"\n"+
                "Su casa es: "+ casita1.getCasa()+"\n"+
                "Su boggart es: "+miedo1.getBoggart() +"\n"+
                "Su patronus es: "+patronous1.getPatronus()+"\n"+


                "\n \n"+ "-----"+Lupin.getNombre()+"-----"+"\n"+
                "Su genero es: "+ gener2.getGenero()+"\n"+
                "Su casa es: "+ casita2.getCasa()+"\n"+
                "Su boggart es: "+miedo2.getBoggart() +"\n"+
                "Su patronus es: "+patronous2.getPatronus()+"\n"+


                "\n \n"+ "-----"+Snape.getNombre()+"-----"+"\n"+
                "Su genero es: "+ gener3.getGenero()+"\n"+
                "Su casa es: "+ casita3.getCasa()+"\n"+
                "Su boggart es: "+miedo3.getBoggart() +"\n"+
                "Su patronus es: "+patronous3.getPatronus()+"\n"+


                "\n \n" + "-----"+Voldemor.getNombre()+"-----"+"\n"+
                "Su genero es: "+ gener4.getGenero()+"\n"+
                "Su casa es: "+ casita4.getCasa()+"\n"+
                "Su boggart es: "+miedo4.getBoggart() +"\n"+
                "Su patronus es: "+patronous4.getPatronus()+"\n";
        System.out.println(msg);
    }


}