# Graphs
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

- This application contains these methods:

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

  - Arguments: none
  - Returns the total number of nodes in the graph

## Challenge

- Implement your own Graph. The graph should be represented as an adjacency list, and should include the required methods.

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

