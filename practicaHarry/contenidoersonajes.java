package Tareas;

public class contenidoersonajes {
    public String casa, nombre, genero, boggart, patronus;

    public String getCasa(){  return casa;  }

    public void setCasa(String casa){
      if(!casa.isEmpty()){
          this.casa = casa;
      }
    }

    public String getNombre(){  return nombre;  }

    public void setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getGenero(){  return genero;  }

    public void setGenero(String genero){
      if (!genero.isEmpty()){
          this.genero = genero;
      }
    }

    public String getBoggart(){  return boggart;  }

    public void setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
        }
    }

    public String getPatronus(){  return patronus;  }

    public void setPatronus(String patronus){
      if (!patronus.isEmpty()){
          this.patronus = patronus;
      }
    }
}
