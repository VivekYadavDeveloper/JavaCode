db.createCollection("seriesName", {
    validator: {

        $jsonSchema: {
            required: ['bookName', 'price'],
            properties:{bookName:{bsonType:'string',description:'Must be string'},price:{bsonType:'number',description:'Must be number'}}
        }
    },
    validationAction:'error'
})