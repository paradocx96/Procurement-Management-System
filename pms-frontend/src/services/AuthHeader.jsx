export default function AuthHeaderSupplier() {
    const user = JSON.parse(sessionStorage.getItem('supplier'));

    if (user && user.accessToken) {
        return { Authorization: 'Bearer ' + user.accessToken };
    } else {
        return {};
    }
}

export default function AuthHeaderInternelUser() {
    const user = JSON.parse(sessionStorage.getItem('internalUser'));

    if (user && user.accessToken) {
        return { Authorization: 'Bearer ' + user.accessToken };
    } else {
        return {};
    }
}