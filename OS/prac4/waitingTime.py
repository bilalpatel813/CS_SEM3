def findWaitingTime(processes, n, bt, wt, quantum):
    rem_bt = bt.copy()
    t = 0

    while True:
        done = True

        for i in range(n):
            if rem_bt[i] > 0:
                done = False

                # If remaining burst time is greater than quantum
                if rem_bt[i] > quantum:
                    t += quantum
                    rem_bt[i] -= quantum

                else:
                    t += rem_bt[i]
                    wt[i] = t - bt[i]
                    rem_bt[i] = 0

        # If all processes are completed
        if done:
            break


def findTurnAroundTime(processes, n, bt, wt, tat):
    for i in range(n):
        tat[i] = bt[i] + wt[i]


def findavgTime(processes, n, bt, quantum):
    wt = [0] * n
    tat = [0] * n

    # Calculate waiting time
    findWaitingTime(processes, n, bt, wt, quantum)

    # Calculate turnaround time
    findTurnAroundTime(processes, n, bt, wt, tat)

    print("Processes\tBurst Time\tWaiting Time\tTurn-Around Time")

    total_wt = 0
    total_tat = 0

    for i in range(n):
        total_wt += wt[i]
        total_tat += tat[i]

        print(
            i + 1,
            "\t\t",
            bt[i],
            "\t\t",
            wt[i],
            "\t\t",
            tat[i]
        )

    print("\nAverage waiting time = %.5f" % (total_wt / n))
    print("Average turnaround time = %.5f" % (total_tat / n))


# Main program
if __name__ == "__main__":
    proc = [1, 2, 3]
    n = 3
    burst_time = [10, 5, 8]
    quantum = 2

    findavgTime(proc, n, burst_time, quantum)