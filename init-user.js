db = db.getSiblingDB('productdb');

db.createUser({
    user: 'igor',
    pwd: 'igor123',
    roles: [
        {
            role: 'readWrite',
            db: 'productdb'
        }
    ]
});
