jon = input()
doctor = input()
jon_aer = len(jon)
doctor_aer = len(doctor)
if jon[jon_aer-1] == 'h' and doctor[doctor_aer-1] == 'h' and jon_aer <= 1000 and doctor_aer <= 1000:
    if(jon_aer >= doctor_aer):
        print("go")
    else:
        print("no")
else:
    print("no")
