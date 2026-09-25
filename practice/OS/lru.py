def lru_replacement_page(pages,capacity):
  frames =[]
  page_fault=0

  for page in pages:

    if page in frames:
      frames.remove(page)
      frames.append(page)

    else:
      page_fault +=1

      if len(frames)==capacity:
        frames.pop(0)

      frames.append(page)

    print(f"page {page} -> {frames}")
    print("Total page fault: ",page_fault)

pages = [1, 2, 3, 1, 4, 5, 2, 1, 6]
capacity = 3
lru_replacement_page(pages,capacity)
  

      
    
  