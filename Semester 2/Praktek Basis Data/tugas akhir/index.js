import { prismaClient } from "./prisma/prismaClient.js";
import crypto from "crypto";
import { fakerID_ID as faker } from "@faker-js/faker";

(async () => {
  const users = await prismaClient.users.findMany({
    where: {
      role: "SELLER",
    },
  });
  //   console.log(users);
  const buildFakeAddress = users.map((a) => {
    return {
      city: faker.location.city(),
      detail: faker.location.streetAddress(),
      name: "KOS",
      phone: faker.phone.number(),
      postalCode: faker.location.zipCode(),
      province: faker.location.state(),
      isPrimary: false,
      idUser: a.idUser,
    };
  });
  console.log(buildFakeAddress);
  const inAddress = await prismaClient.address.createMany({
    data: buildFakeAddress,
  });
  console.log(inAddress);
})();
