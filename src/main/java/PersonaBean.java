import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonaBean {
   
   private String nombre;
   private String edad;
   private String descripcion;
   private String dia;
   private String genero;
   private String[] idioma;
   private List<String> profesionList;
   private List<String> profesionSeleccionada;
   
   public PersonaBean() {
      profesionList = new ArrayList<String>();
      profesionList.add("Bachiller");
      profesionList.add("Tecnologo");
      profesionList.add("Especialista");
      profesionList.add("Doctorado");
      profesionList.add("Tecnico");
      profesionList.add("Profesional");
      profesionList.add("Maestria");
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getEdad() {
      return edad;
   }

   public void setEdad(String edad) {
      this.edad = edad;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }

   public String getDia() {
      return dia;
   }

   public void setDia(String dia) {
      this.dia = dia;
   }

   public String getGenero() {
      return genero;
   }

   public void setGenero(String genero) {
      this.genero = genero;
   }

   

   public String[] getIdioma() {
      return idioma;
   }

   public void setIdioma(String[] idioma) {
      this.idioma = idioma;
   }

   public List<String> getProfesionList() {
      return profesionList;
   }

   public void setProfesionList(List<String> profesionList) {
      this.profesionList = profesionList;
   }

   public List<String> getProfesionSeleccionada() {
      return profesionSeleccionada;
   }

   public void setProfesionSeleccionada(List<String> profesionSeleccionada) {
      this.profesionSeleccionada = profesionSeleccionada;
   }
   
}
