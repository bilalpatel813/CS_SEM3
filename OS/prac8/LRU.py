def lru_page_replacement(pages, capacity):
    frames = []
    page_faults = 0

    for page in pages:

        # Page is already in memory
        if page in frames:
            frames.remove(page)
            frames.append(page)

        # Page fault
        else:
            page_faults += 1

            # If memory is full, remove LRU page
            if len(frames) == capacity:
                frames.pop(0)

            # Add new page
            frames.append(page)

        print(f"Page {page} -> {frames}")

    print("Total Page Faults:", page_faults)


pages = [1, 2, 3, 1, 4, 5, 2, 1, 6]
capacity = 3

lru_page_replacement(pages, capacity)