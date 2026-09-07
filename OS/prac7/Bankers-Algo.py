# Banker's Algorithm

def is_safe(processes, available, max_need, allocation):
    n = len(processes)
    m = len(available)

    # Calculate Need Matrix
    need = []

    for i in range(n):
        row = []

        for j in range(m):
            row.append(max_need[i][j] - allocation[i][j])

        need.append(row)

    print("\nNeed Matrix:")

    for i in range(n):
        print(processes[i], need[i])

    work = available.copy()
    finish = [False] * n
    safe_sequence = []

    while len(safe_sequence) < n:
        found = False

        for i in range(n):
            if not finish[i]:

                # Check if Need <= Available
                if all(need[i][j] <= work[j] for j in range(m)):

                    # Process can complete
                    for j in range(m):
                        work[j] += allocation[i][j]

                    finish[i] = True
                    safe_sequence.append(processes[i])
                    found = True

        if not found:
            print("\nSystem is NOT in a safe state.")
            return False

    print("\nSystem is in a SAFE state.")
    print("Safe Sequence:", " -> ".join(safe_sequence))

    return True


# Processes
processes = ["P0", "P1", "P2", "P3", "P4"]

# Available resources
available = [3, 3, 2]

# Maximum resource requirement
max_need = [
    [7, 5, 3],
    [3, 2, 2],
    [9, 0, 2],
    [2, 2, 2],
    [4, 3, 3]
]

# Currently allocated resources
allocation = [
    [0, 1, 0],
    [2, 0, 0],
    [3, 0, 2],
    [2, 1, 1],
    [0, 0, 2]
]

# Run Banker's Algorithm
is_safe(processes, available, max_need, allocation)