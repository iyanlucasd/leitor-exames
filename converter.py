import pdftotext
from unidecode import unidecode

delimiter = "____________________________________________________________________________________________"

memory_file = open('iyan.pdf', 'rb') 

pdf = pdftotext.PDF(memory_file)

foo = []

for x in pdf:
    foo.append(unidecode(x))


with open('converted.txt', 'w') as f:
    for x in foo:
        f.write(x)
