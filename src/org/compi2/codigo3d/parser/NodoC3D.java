package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String trueValues;
    private String falseValues;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String v, String f){
        this.cad = cad;
        this.trueValues = v;
        this.falseValues = f;
    }
    
    public String getCad(){
        return cad;
    }

    public String getTrueValues() {
        return trueValues;
    }

    public void setTrueValues(String trueValues) {
        this.trueValues = trueValues;
    }

    public String getFalseValues() {
        return falseValues;
    }

    public void setFalseValues(String falseValues) {
        this.falseValues = falseValues;
    }
        
    
        
}
