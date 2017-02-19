import sys

def GEDCOM():
    with open('Arjun_Dass_GEDCOM-2.ged') as x:
        for line in x:
            print(line.rstrip())
            list = line.split()
            try:
                if list[0] == 'NOTE':
                    continue
                else: print("Level: ",list[0])
                if list[1] in ('NAME', 'DEAT', 'DIV', 'MARR', 'BIRT', 'WIFE', 'HUSB', 'CHIL',  'DATE', 'HEAD','TRLR', 'SEX', 'FAMS', 'FAMC','NOTE'):
                    print("Tag: ",list[1])
                elif list[2] in ('INDI', 'FAM'):
                    print("Tag: ",list[2])
                else: print('Tag: TAG NOT SUPPORTED')
            except IndexError:
                print('Tag: Invalid Tag')


if __name__=='__main__':
    sys.stdout = open("OutputFile.txt","w")
    GEDCOM()
    sys.__stdout__.close()