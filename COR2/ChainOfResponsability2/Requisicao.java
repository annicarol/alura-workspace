    enum Formato {
      XML,
      CSV,
      PORCENTO
    }

    class Requisicao {
      private Formato formato;
      public Requisicao(Formato formato) {
        this.formato = formato;
      }

      public Formato getFormato() {
    	return formato;  
      };
      
      
    }