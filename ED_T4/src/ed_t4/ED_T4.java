/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_t4;

/**
 *
 * @author pinvalda
 */
public class ED_T4 {

    /**
     * @param args the command line arguments
     */
    public class Votacion {
        private String nombre;
        private Integer votos;
        
        public Votacion(){
            
        }

        public Votacion(String nombre) {
            this.nombre = nombre;
        }

        
        public Votacion(String nombre, Integer votos) {
            
            this.nombre = nombre;
            this.votos = votos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Integer getVotos() {
            return votos;
        }

       
    }
    
}
