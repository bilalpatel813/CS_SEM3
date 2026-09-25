def DFS(graph,start):

  visited = []
  stack = []

  stack.append(start)

  while stack:

    vertex = stack.pop()

    if vertex not in visited:

      visited.append(vertex)
      print(vertex,end=" ")
      for neigh in graph[vertex]:
        if neigh not in visited:

          stack.append(neigh)

graph = {
    0: [1, 2],
    1: [2],
    2: [3],
    3: [1, 2]
}  
print("\n DFS: ")
DFS(graph,0)

  