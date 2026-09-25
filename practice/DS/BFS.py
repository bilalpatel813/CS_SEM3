def BFS(graph,start):

  visited= []
  queue = []

  visited.append(start)
  queue.append(start)

  while queue:

    vertex = queue.pop(0)
    print(vertex,end=" ")
    for neigh in graph[vertex]:
       if neigh not in visited:
         visited.append(neigh)
         queue.append(neigh)

graph = {
    0: [1, 2],
    1: [2],
    2: [3],
    3: [1, 2]
}
print("BFS : ")
BFS(graph,0)
