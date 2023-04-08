package aula8;

public class Loja {
    //crio um atributo vetor do tipo animal
    //n�o passo o nel pq n�o sei quantos animais vai ter

    private Animal store[];

    public Loja(int quantidade) {
        //instancio o objeto do tipo store
        store = new Animal[quantidade];
    }

    public void inserirAnimal(int pos, Animal a) {
        //verifica se a posicao � maior que o tamanho do vetor
        if (pos >= store.length) {
            System.out.println("posi��o inv�lida");
        } else {
            //se uma posicao do vetor estiver vazia
            if (store[pos] == null) {
                //guardo um animal em uma posicao do vetor
                store[pos] = a;
            } else {
                System.out.println("posi��o ocupada");
            }
        }
    }

    public void mostrarLoja() {
        for (int i = 0; i < store.length; i++) {
            if (store[i] != null) {
                store[i].mostrarAnimal();
            }
        }
    }

    public void excluirAnimal(int pos) {
        if (pos >= store.length) {
            System.out.println("posi��o inv�lida");
        } else {

            if (store[pos] != null) {
                //apago um animal em uma posicao do vetor
                store[pos] = null;
                //System.out.println("animal exclu�do com sucesso");
            } else {
                System.out.println("posi��o ocupada");
            }
        }
    } //do m�todo

    public void alterarAnimal(int pos, Animal novo) {
        if (pos >= store.length) {
            System.out.println("posi��o inv�lida");
        } else {
            if (store[pos] != null) {
                store[pos] = novo;
            } else {
                System.out.println("posi��o ocupada");
            }
        }
    }

    public void buscarAnimal(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < store.length; i++) {
            if (store[i] != null) {
                if (store[i].getNome().equals(nome)) {
                    store[i].mostrarAnimal();
                    encontrado = true;
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Animal não existe");
        }
    }
}
