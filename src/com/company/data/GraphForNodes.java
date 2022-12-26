/*
 *  Program: Prosty edytor grafu
 *     Plik: GraphForNodes.java
 *
 *  Klasa GraphForNodes reprezentuje graf na p�aszczy�nie.
 *  Klasa mo�e by� klas� bazow� dla klas reprezentuj�cych
 *  grafy modeluj�ce wybrane zagadnienia np.:
 *     - schemat komunikacji miejskiej,
 *     - drzewo genealogiczne,
 *     - schemat obwodu elektronicznego typu RLC,
 *     - schemat topologi sieci komputerowej
 *
 *    Autor: Pawel Rogalinski
 *     Data:  listopad 2021 r.
 */

package com.company.data;

import com.company.dataElements.Edge;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class GraphForNodes implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Node> nodes;

    private List<Edge> edges;

    public GraphForNodes() {
        this.nodes = new ArrayList<Node>();
        this.edges = new ArrayList<Edge>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }


    public void removeNode(Node node) {
        nodes.remove(node);
    }

    public void removeEdge(Edge edge) {
        edges.remove(edge);
    }

    public Node[] getNodes() {
        Node[] array = new Node[0];
        return nodes.toArray(array);
    }

    public List<Node> getNodesList() {
        return nodes;
    }

    public List<Edge> getEdgesList() {
        return edges;
    }


    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void draw(Graphics g) {
        for (Node node : nodes) {
            node.draw(g);
        }
        for (Edge edge : edges) {
            edge.draw(g);
        }
    }

}
