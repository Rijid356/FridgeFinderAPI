db.item.update(
    {'description': 'Chocolate Chips'},
    {
        'description': 'Chocolate Chips',
        'quantity': 1,
        'ounces': null,
        'type': '',
        'percentageLeft': 100,
        'expirationDate': null,
        'needsThawed': false,
        'thawTime': null,
        'isMeal': false
    },
    {upsert: true}
);