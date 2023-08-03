package Class24;

public interface Flying {
    abstract void toFlap(); //No es necesario crear el cuerpo del función, esto lo va a implementar la clase que aplique
    //esta INTERFACE, esto es solo un contrato. La clase va a tener que utilizar las funciones que declare en la
    //interface de manera OBLIGATORIA.
    public void toGlide(); //Planear
    //"public" queda en gris porque es redundante, no es necesario que lo coloque, luego la clase que utilice esta
    //interface escogerá su modificador de acceso adecuado.

    //La clase que implemente esta interface deberá utilizar los funciones aletear y planear de manera obligatoria.

}
