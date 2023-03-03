

public class voln {
    public ArrayList<Integer> PathRecovery(int fromNode, int toNode, int[] markedNode, ElementManager elementManager) {  // восстановление пути
        ArrayList<Integer> paramsPaveTheRoute = new ArrayList<>();      // массив, где хранится путь
        if (markedNode[elementManager.GetNode(toNode).number] != 0) {   // еще раз проверяем дошел ли алгоритм до финишного узла
            paramsPaveTheRoute.add(toNode);                             // добавляем финишный узел к пути
            ElementManager.Node currentNode = elementManager.GetNode(toNode);
            while (currentNode.number != fromNode) {                     // пока не дошли до стартового узла
                for (int i = 0; i < currentNode.near.size(); i++) {      // проверяем соседние узлы
                    if (markedNode[elementManager.GetNode(currentNode.near.get(i).number).number]
                            == markedNode[currentNode.number] - 1) {     // если значение пометки узла на 1 меньше, чем у предыдущего узла
                        currentNode = elementManager.GetNode(currentNode.near.get(i).number); //узел становится текущим
                        paramsPaveTheRoute.add(currentNode.number);      // заносится в массив
                    }
                }
            }
        }
        return paramsPaveTheRoute;
    }
}