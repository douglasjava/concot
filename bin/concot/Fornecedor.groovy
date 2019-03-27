package concot

class Fornecedor {

    static constraints = {
		nome nullable: false, blank:false, maxSize:128, unique: true
    }
}
