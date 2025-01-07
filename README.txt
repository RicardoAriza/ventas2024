Diccionario de API

Entidad: Empresa

Base URL: /empresa

Endpoints

GET /traer

Descripción: Obtiene la lista de todas las empresas.
Respuesta:
json

[
  {
    "idEmpresa": 1,
    "nombre": "Empresa A",
    "correoContacto": "contacto@empresa.com",
    "telefono": "123456789",
    "direccion": "Calle 123",
    "fechaRegistro": "2024-01-01"
  }
]

GET /{id}

Descripción: Obtiene una empresa por su ID.
Respuesta:
json

{
  "idEmpresa": 1,
  "nombre": "Empresa A",
  "correoContacto": "contacto@empresa.com",
  "telefono": "123456789",
  "direccion": "Calle 123",
  "fechaRegistro": "2024-01-01"
}

POST /crear

Descripción: Crea una nueva empresa.

Body:

json

{
  "nombre": "Empresa A",
  "correoContacto": "contacto@empresa.com",
  "telefono": "123456789",
  "direccion": "Calle 123",
  "fechaRegistro": "2024-01-01"
}

DELETE /borrar/{id}

Descripción: Elimina una empresa por su ID.

PUT /editar

Descripción: Edita una empresa existente.

Body:

{
  "idEmpresa": 1,
  "nombre": "Empresa Actualizada",
  "correoContacto": "nuevo@empresa.com",
  "telefono": "987654321",
  "direccion": "Avenida Real 456",
  "fechaRegistro": "2024-12-11"
}

Entidad: Categoria
Base URL: /categoria

Endpoints
GET /traer

Descripción: Obtiene la lista de todas las categorías.
Respuesta:
json

[
  {
    "idCategoria": 1,
    "idEmpresa": 1,
    "nombre": "Electrónica"
  }
]

GET /{id}

Descripción: Obtiene una categoría por su ID.

Respuesta:

json

{
  "idCategoria": 1,
  "idEmpresa": 1,
  "nombre": "Electrónica"
}

POST /crear

Descripción: Crea una nueva categoría.

Body:

json

{
    "empresa": {
        "idEmpresa": 1
    },
    "nombre": "Electrónica"
}

DELETE /borrar/{id}

Descripción: Elimina una categoría por su ID.
PUT /editar

Descripción: Edita una categoría existente.

Body:

{
    "idCategoria": 1,
    "empresa": {
        "idEmpresa": 1
    },
    "nombre": "Electrónica y Tecnología"
}

Entidad: Producto

Base URL: /producto

Endpoints

GET /traer

Descripción: Obtiene la lista de todos los productos.

Respuesta:

json

[
  {
    "idProducto": 1,
    "empresa": {
        "idEmpresa": 1
    },
    "categoria": {
        "idCategoria": 1
    },
    "nombre": "Smartphone",
    "descripcion": "Smartphone con pantalla de 6.5 pulgadas",
    "precio": "500",
    "stock": "150"
}
]

GET /{id}

Descripción: Obtiene un producto por su ID.
Respuesta:

json

{
    "idProducto": 1,
    "empresa": {
        "idEmpresa": 1
    },
    "categoria": {
        "idCategoria": 1
    },
    "nombre": "Smartphone",
    "descripcion": "Smartphone con pantalla de 6.5 pulgadas",
    "precio": "500",
    "stock": "150"
}

POST /crear

Descripción: Crea un nuevo producto.
Body:
json

{
  {
    "empresa": {
        "idEmpresa": 1
    },
    "categoria": {
        "idCategoria": 1
    },
    "nombre": "Smartphone",
    "descripcion": "Smartphone con pantalla de 6.5 pulgadas",
    "precio": "500",
    "stock": "150"
}
}
DELETE /borrar/{id}

Descripción: Elimina un producto por su ID.
PUT /editar

Descripción: Edita un producto existente.
Body: 

{
    "idProducto": 1,
    "empresa": {
        "idEmpresa": 1
    },
    "categoria": {
        "idCategoria": 1
    },
    "nombre": "Laptop Pro",
    "descripcion": "Laptop con procesador i7 y 16GB RAM",
    "precio": "1200",
    "stock": "50"
}

Entidad: Pago

Base URL: /pago

Endpoints:

1. Obtener todos los pagos

Método: GET

URL: /pago/traer

Descripción: Devuelve una lista de todos los pagos registrados.

Respuesta:
Código: 200 OK

Cuerpo:
json

[
  {
    "idPago": 1,
    "pedido": {
      "idPedido": 10,
      "usuario": {
        "idUsuario": 5,
        "nombre": "Juan Pérez"
      },
      "total": 1500.0,
      "estado": "COMPLETADO",
      "tipo": "NORMAL"
    }
]

2. Obtener un pago por ID

Método: GET

URL: /pago/{id}

Descripción: Busca un pago específico por su ID.

Parámetros de ruta:
id: ID del pago.

Respuesta:
Código: 200 OK

Cuerpo:
json

{
    "idPago": 1,
    "pedido": {
      "idPedido": 10,
      "usuario": {
        "idUsuario": 5,
        "nombre": "Juan Pérez"
      },
      "total": 1500.0,
      "estado": "COMPLETADO",
      "tipo": "NORMAL"
}

3. Crear un nuevo pago

Método: POST
URL: /pago/crear

Descripción: Crea un nuevo registro de pago.

Cuerpo de la solicitud:
json

{
    "pedido": {
        "idPedido": 1
    },
    "monto": 100.0,
    "metodo": "Tarjeta",
    "fecha": "2024-12-12",
    "empresa": {
        "idEmpresa": 1
    }
}

Respuesta:
Código: 200 OK o 400 Bad Request
Tipo: text/plain
Cuerpo:
Éxito: "El pago fue creado correctamente"
Error: "Los datos del pago son incorrectos"
4. Eliminar un pago
Método: DELETE
URL: /pago/borrar/{id}
Descripción: Elimina un pago específico por su ID.
Parámetros de ruta:
id: ID del pago.
Respuesta:
Código: 200 OK
Tipo: text/plain
Cuerpo: "El pago fue eliminado correctamente"
5. Editar un pago
Método: PUT
URL: /pago/editar
Descripción: Actualiza la información de un pago existente.
Cuerpo de la solicitud:
json
Copiar código
{
  "idPago": Long,
  "pedido": Pedido,
  "monto": double,
  "metodo": "TARJETA" | "EFECTIVO" | "TRANSFERENCIA",
  "fecha": String,
  "empresa": Empresa
}
Respuesta:
Código: 200 OK
Tipo: application/json
Cuerpo:
json
Copiar código
{
  "idPago": Long,
  "pedido": Pedido,
  "monto": double,
  "metodo": "TARJETA" | "EFECTIVO" | "TRANSFERENCIA",
  "fecha": String,
  "empresa": Empresa
}


Errores:

404 Not Found: La categoría no existe.
Códigos de Estado HTTP
Código	Significado
200	Solicitud exitosa.
201	Recurso creado.
204	Sin contenido.
400	Solicitud incorrecta.
404	Recurso no encontrado.
500	Error interno del servidor.