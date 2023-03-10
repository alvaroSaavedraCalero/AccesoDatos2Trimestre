package accesodatos.modelos;
// Generated 03-feb-2023 17:33:46 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PrestamosId generated by hbm2java
 */
public class PrestamosId  implements java.io.Serializable {


     private int codigolibro;
     private Date fechaprestamo;

    public PrestamosId() {
    }

    public PrestamosId(int codigolibro, Date fechaprestamo) {
       this.codigolibro = codigolibro;
       this.fechaprestamo = fechaprestamo;
    }
   
    public int getCodigolibro() {
        return this.codigolibro;
    }
    
    public void setCodigolibro(int codigolibro) {
        this.codigolibro = codigolibro;
    }
    public Date getFechaprestamo() {
        return this.fechaprestamo;
    }
    
    public void setFechaprestamo(Date fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PrestamosId) ) return false;
		 PrestamosId castOther = ( PrestamosId ) other; 
         
		 return (this.getCodigolibro()==castOther.getCodigolibro())
 && ( (this.getFechaprestamo()==castOther.getFechaprestamo()) || ( this.getFechaprestamo()!=null && castOther.getFechaprestamo()!=null && this.getFechaprestamo().equals(castOther.getFechaprestamo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodigolibro();
         result = 37 * result + ( getFechaprestamo() == null ? 0 : this.getFechaprestamo().hashCode() );
         return result;
   }   


}


