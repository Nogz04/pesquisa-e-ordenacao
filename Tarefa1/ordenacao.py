class Ordenacao:

    @staticmethod
    def metodoBolha(lista = []):
        """
        Método estático que ordenda uma lista utilizando o método de ordenação Bubble Sort.

        :param lista: Lista passada por parametro que o método bolha irá utilizar para fazer a ordenação.
        :return: a lista ordenada.
        """
        houveTroca = True
        while (houveTroca):
            houveTroca = False
            for i in range(0, len(lista)-1):
                if (lista[i] > lista[i+1]):
                    houveTroca = True
                    aux = lista[i]
                    lista[i] = lista[i+1]
                    lista[i+1] = aux

        return lista


    @staticmethod
    def metodoSelecao(lista = []):
        """
        Método estático que ordenda uma lista utilizando o método de ordenação Selection Sort.

        :param lista: Lista passada por parametro que o método bolha irá utilizar para fazer a ordenação.
        :return: a lista ordenada.
        """
        n = len(lista)
        for i in range(n):
            min_index = i
            for j in range(i + 1, n):
                if lista[j] < lista[min_index]:
                    min_index = j
            lista[i], lista[min_index] = lista[min_index], lista[i] # trocando os índices de posicao

        return lista


    @staticmethod
    def metodoInsercao(lista=[]):
        """
        Método estático que ordenda uma lista utilizando o método de ordenação Insertion Sort.

        :param lista: Lista passada por parametro que o método bolha irá utilizar para fazer a ordenação.
        :return: a lista ordenada.
        """
        for i in range(1, len(lista)):
            aux = lista[i]
            j = i - 1
            while j >= 0 and lista[j] > aux:
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = aux

        return lista

