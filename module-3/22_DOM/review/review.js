// this is kind of like static void main
window.onload = () =>
{
    const div = document.getElementById('names');

    const names = getNames();
    const customers = convertListToCustomers(names);

    const jsonNames = JSON.stringify(names);

    const ul = document.createElement('ul');

    let li = document.createElement('li');
    li.innerHTML = "Donte Beltran";
    ul.appendChild(li);

    
    let li = document.createElement('li');
    li.innerHTML = "Kennedy Myers";
    ul.appendChild(li);

    div.innerText = jsonNames;

}

/**
 * @returns {string[]} a list of names from a fake Web API call
 */
function getNames()
{
    // here you will make an API call to get a list of names from a web server
    const names = [
        '1,Donte,Beltran',
        '2,Kennedy,Myers',
        '3,Shirley,Simmons',
        '4,Jacquelin,Mcgee',
        '5,Harley,Andrews',
        '6,Scarlet,Edwards',
        '7,Janiyah,Dodson',
        '8,Janelle,Singh',
        '9,Aniyah,Blevins',
        '10,Cannon,Cross',
        '11,Aleah,Abbott',
        '12,Hugh,Mann',
        '13,Luke,Bishop',
        '14,Sanaa,Davies',
        '15,Emilia,Dixon',
        '16,Giancarlo,Ruiz',
        '17,Adriana,Peck',
        '18,Kian,Vang',
        '19,Yadira,Porter',
        '20,Jamie,Grant'
    ];

    return names;
}


/*
create a function that takes an array of full names

i.e.:
[
    '1,Donte,Beltran',
    '2,Kennedy,Myers'
]

and return an array of Customer objects
[
    {
        id: 1,
        firstName: 'Donte',
        lastName: 'Beltran'
    },
    {
        id: 2,
        firstName: 'Kennedy',
        lastName: 'Myers'
    }
]
*/

/**
 * 
 * @param {string[]} names
 * @returns {objects[]} list of customers
 */


const convertListToCustomers = (names) =>
{


    const customers = names.map(convertToCustomer);

    return customers;
}

const convertToCustomer = (name) =>
{
    const values = name.split(',');

        const Customer = {
            id: values[0],
            firstName: values[1],
            lastName: values[2]
        };
        return customer;
}