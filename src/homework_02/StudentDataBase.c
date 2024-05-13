#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Student{
    char *name;
    int matNr;
};

struct StudentDataBase{
    struct Student *data;
    int size;
};

int addStudentsToDataBase(struct StudentDataBase* sDB) {
    for(int i = 0; i < sDB->size; i++) {
        printf("\nPlease enter the students name: ");
        char string[41];
        scanf("%40s", string);
        sDB->data[i].name = strdup(string);

        printf("\nPlease enter the students matriculation number: ");
        scanf("%d", &(sDB->data[i].matNr));
    }

    return 0;
}

void printStudentDB(struct StudentDataBase* sDB) {
    for(int i = 0; i < sDB->size; i++) {
        printf("\nName: %s, matNr: %d", sDB->data[i].name, sDB->data[i].matNr);
    }
}

void deleteStudentDB(struct StudentDataBase* sDB) {
    if(sDB != NULL) {
        if(sDB->data != NULL) {
            for(int i = 0; i < sDB->size; i++) {
                free(sDB->data[i].name);
            }
            free(sDB->data);
        }
        free(sDB);
    }
}

int main(int argc, char** argv) {
    int number = 0;
    printf("Please enter how many students you want to store: ");
    scanf("%d", &number);

    struct StudentDataBase* sDB = malloc(sizeof(struct StudentDataBase));
    if(sDB != NULL) {
        sDB->data = malloc(number * sizeof(struct Student));
        if(sDB->data != NULL) {
            sDB->size = number;

            addStudentsToDataBase(sDB);
            printStudentDB(sDB);

            deleteStudentDB(sDB);
        }
    }

    return 0;
}
