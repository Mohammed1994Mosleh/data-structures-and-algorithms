# Graphs
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

## Whiteboard Process

- Whiteboard for breadthfirst
![](graph.png)

- Whiteboard for businesstrip
![](businesstrip.png)

-Whiteboard for Depth-First
![](depth.png)

## This application contains these methods:

1. add node
  - Arguments: value
  - Returns: The added node
  - Add a node to the graph

2. add edge

   - Arguments: 2 nodes to be connected by the edge, weight (optional)
   - Returns: nothing
   - Adds a new edge between two nodes in the graph
     If specified, assign a weight to the edge
     Both nodes should already be in the Graph

3. get nodes

   - Arguments: none
   - Returns all of the nodes in the graph as a collection (set, list, or similar)

4.get neighbors

   - Arguments: node
   - Returns a collection of edges connected to the given node
    Include the weight of the connection in the returned collection

5. size

  - Arguments: graph, array of city names
  - Returns cost or null

6. businesstrip

   - Arguments: node
   - Returns a collection of edges connected to the given node
    Include the weight of the connection in the returned collection

7. Depth-first

   - Name: Depth first
   - Arguments: Node (Starting point of search)
   - Return: A collection of nodes in their pre-order depth-first traversal order
     Program output: Display the collection.

## Challenge

- Implement your own Graph. The graph should be represented as an adjacency list, and should include the required methods.
- Write method to traverse graph using breadth first algorithim.

## Challenge for businesstrip

-  Write method called businesstrip that determines trip is possible with direct flights and how much it would cost.

## Challenge for Depth-first

-  Write method to traverse graph using Depth-First algorithim.


## Approach & Efficiency

- add node

 Time : O(1), no loops.

 Space : O(n), create node with children's list.

- add edge

   Time : O(1), no loops.

   Space : O(1), no extra spaces.

- get nodes

   Time : O(1), no loops.

   Space : O(1), no extra spaces.

- get neighbors

   Time : O(1), no loops.

   Space : O(1), no extra spaces.

- size

   Time : O(1), no loops.

   Space : O(1), no extra spaces.

## Approach & Efficiency for businesstrip

- Time.O(n)
- Space O(1).

## Approach & Efficiency for Depth-First

- Time.O(n^2)
- Space O(n).

